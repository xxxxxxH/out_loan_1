package net.basicmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import net.fragment.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var views: ArrayList<Fragment> = ArrayList()
    var inputFragment: InputFragment? = null
    var tableFragment: TableFragment? = null
    var graphFragment: GraphFragment? = null
    var chartFragment: ChartFragment? = null
    var sumFragment: SumFragment? = null
    var tabStr = arrayOf("INPUT", "TABLE", "GRAPH", "CHART", "SUM")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        inputFragment = InputFragment()
        tableFragment = TableFragment()
        graphFragment = GraphFragment()
        chartFragment = ChartFragment()
        sumFragment = SumFragment()
        views.add(inputFragment!!)
        views.add(tableFragment!!)
        views.add(graphFragment!!)
        views.add(chartFragment!!)
        views.add(sumFragment!!)
        tab.setViewPager(viewpager, tabStr, this, views)
    }
}