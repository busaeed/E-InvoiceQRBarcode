# E-InvoiceQRBarCode
 A small, easy to use java library to generate QR barcode hash as per the requirements of the ZATCA in Saudi Arabia.
 
 Example:
 ```
 String qrBarcodeHash = QRBarcodeEncoder.encode(
    new Seller("شركة تجريبية"),
    new TaxNumber("312345678901233"),
    new InvoiceDate("2021-11-18T18:40:34+03:00"),
    new InvoiceTotalAmount("2.30"),
    new InvoiceTaxAmount("0.30")
);
 ```
 
 Note: to integrate the library in android
       use the "ZakatQrCodeAndroidLib-android.aar", and the logic is as the previous example nothing changes.


