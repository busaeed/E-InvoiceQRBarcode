package com.blacksoft.zakat_qr_code;

import android.util.Base64;

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
        return Base64.encodeToString(tlvString.getBytes(), 0);
    }

}
