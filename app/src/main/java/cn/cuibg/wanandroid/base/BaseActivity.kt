package com.sbingo.wanandroid_mvvm.base

import android.app.AlertDialog
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.content.PermissionChecker
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import java.util.*

/**
 * Author: Sbingo666
 * Date:   2019/4/3
 */
abstract class BaseActivity : AppCompatActivity() {

    protected abstract var layoutId: Int

    protected abstract fun initData()


    private lateinit var deniedPermissions: HashMap<String, Array<String>>
    private var showPermissionDialogOnDenied: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (this !is BaseBindingActivity<*>) {
            setContentView(layoutId)
        }
        initData()
    }

    open fun onRetry() {

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}