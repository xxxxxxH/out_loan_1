package net.fragment

import android.text.InputType
import kotlinx.android.synthetic.main.layout_fragment_input.*
import net.basicmodel.R

class InputFragment : BaseFragment() {
    override fun initView() {
        property.setHint("Property value")
        property.setEditTextContent("￥ 100,000")
        property.view!!.inputType = InputType.TYPE_CLASS_NUMBER
        down.setHint("Down payment")
        principal.setHint("Principal")
        interest.setHint("Interest")
        interest.setEditTextContent("5.0")
        years.setHint("Years")
        years.setEditTextContent("30")
        payment.setHint("Payment")
        payment.view!!.isEnabled = false
    }

    override fun getLayoutId(): Int {
        return R.layout.layout_fragment_input
    }
}