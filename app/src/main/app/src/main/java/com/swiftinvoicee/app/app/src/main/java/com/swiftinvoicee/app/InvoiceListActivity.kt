package com.swiftinvoicee.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.swiftinvoicee.app.databinding.ActivityInvoiceListBinding

class InvoiceListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInvoiceListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInvoiceListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // TODO: load and display invoices
    }
}
