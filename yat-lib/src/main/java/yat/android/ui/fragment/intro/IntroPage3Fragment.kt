/*
 * Copyright 2021 Yat Labs
 *
 * Redistribution and use in source and binary forms, with or
 * without modification, are permitted provided that the
 * following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of
 * its contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND
 * CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package yat.android.ui.fragment.intro

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.orhanobut.logger.Logger
import yat.android.R
import yat.android.data.YatCart
import yat.android.databinding.FragmentIntroPage3Binding
import yat.android.ui.extension.*
import yat.android.ui.extension.gone
import yat.android.ui.extension.visible

internal class IntroPage3Fragment : Fragment() {

    private var _ui: FragmentIntroPage3Binding? = null
    private val ui get() = _ui!!
    private lateinit var viewModel: IntroPage3FragmentViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        viewModel =
            ViewModelProvider(requireActivity()).get(
                IntroPage3FragmentViewModel::class.java
            )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _ui = FragmentIntroPage3Binding.inflate(inflater, container, false)
        return ui.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeUI()
        ui.progressBar.setColor(resources.getColor(R.color.white, null))
        ui.createNewYatButton.setOnClickListener {
            it.temporarilyDisableClick()
            viewModel.createNewYat()
        }
        ui.connectAnExistingYatButton.setOnClickListener {
            it.temporarilyDisableClick()
            viewModel.connectExistingYat()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _ui = null
    }

    private fun subscribeUI() = with(viewModel) {
        externalLink.observe(viewLifecycleOwner) { requireContext().openUrl(it) }

        error.observe(viewLifecycleOwner) { onRandomYatError(it) }

        errorDialog.observe(viewLifecycleOwner) { displayErrorDialog(it) }
    }

    private fun onRandomYatError(throwable: Throwable?) {
        Logger.e(
            "Error while getting random yat.\n"
                    + "Throwable message: ${throwable?.message}"
        )
        ui.createNewYatButton.visible()
        ui.progressBarContainer.gone()
        ui.connectAnExistingYatButton.isEnabled = true
        displayErrorDialog(
            R.string.common_error_title,
            R.string.common_error_message_random_yat
        )
    }

}