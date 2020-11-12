package com.sbingo.wanandroid_mvvm.base
import androidx.viewbinding.ViewBinding


abstract class BaseBindingFragment<V : ViewBinding> : BaseFragment() {

    override var layoutId = 0

    protected abstract var binding: V

}