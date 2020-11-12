package cn.cuibg.wanandroid

import android.view.LayoutInflater
import android.view.MenuItem
import cn.cuibg.wanandroid.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomnavigation.LabelVisibilityMode
import com.sbingo.wanandroid_mvvm.base.BaseBindingActivity

class MainActivity : BaseBindingActivity<ActivityMainBinding>() {

    override val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(LayoutInflater.from(this))
    }

    override fun initData() {
        binding.navView.let {
            it.setOnNavigationItemSelectedListener(object :
                BottomNavigationView.OnNavigationItemSelectedListener {
                override fun onNavigationItemSelected(item: MenuItem): Boolean {
                    when (item.itemId) {
                        R.id.navigation_home -> {
                        }
                        R.id.navigation_public -> {
                        }
                        R.id.navigation_project -> {

                        }
                        R.id.navigation_scan -> {

                        }
                        R.id.navigation_knowledge -> {

                        }
                    }
                    return true
                }

            })
            it.labelVisibilityMode = LabelVisibilityMode.LABEL_VISIBILITY_LABELED
        }
    }
}