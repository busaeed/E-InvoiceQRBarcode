package com.github.busaeed.einvoice.qrbarcode;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

import com.github.busaeed.einvoice.qrbarcode.tag.InvoiceDate;
import com.github.busaeed.einvoice.qrbarcode.tag.InvoiceTaxAmount;
import com.github.busaeed.einvoice.qrbarcode.tag.InvoiceTotalAmount;
import com.github.busaeed.einvoice.qrbarcode.tag.Seller;
import com.github.busaeed.einvoice.qrbarcode.tag.TaxNumber;

public class QRBarcodeEncoder {
	
	private QRBarcodeEncoder() {
		//Factory method pattern
	}
	
	public static String encode(
			Seller seller,
			TaxNumber taxNumber,
			InvoiceDate invoiceDate,
			InvoiceTotalAmount invoiceTotalAmount,
			InvoiceTaxAmount invoiceTaxAmount) {
		return toBase64(toTLV(seller, taxNumber, invoiceDate, invoiceTotalAmount, invoiceTaxAmount));
	}
	
	private static String toTLV(
			Seller seller,
			TaxNumber taxNumber,
			InvoiceDate invoiceDate,
			InvoiceTotalAmount invoiceTotalAmount,
			InvoiceTaxAmount invoiceTaxAmount) {
		return seller.toString()
		+ taxNumber.toString()
		+ invoiceDate.toString()
		+ invoiceTotalAmount.toString()
		+ invoiceTaxAmount.toString();
	}
	
	private static String toBase64(String tlvString) {
		return Base64.getEncoder().encodeToString(tlvString.getBytes(StandardCharsets.UTF_8));
	}

}
