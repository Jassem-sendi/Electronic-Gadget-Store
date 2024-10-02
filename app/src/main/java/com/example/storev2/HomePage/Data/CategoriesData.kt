package com.example.storev2.HomePage.Data

import com.example.storev2.R

data class Categories(
    val id: String,
    val catName: String,
    val catImage: Int,
    val subCategories : List<SubCategory>
)

data class SubCategory(
    val name: String,
    val price: Double,
    val image: Int,
    val description: String
)

val ListOfCategories = listOf(
    //Categories("0", "All", R.drawable.all, listOf()),
    Categories("1", "Laptops", R.drawable.laptops, listOf(
        SubCategory("Gaming Laptop", 1299.99, R.drawable.laptop, "High performance gaming laptop."),
        SubCategory("Ultrabook", 899.99, R.drawable.laptop, "Lightweight and powerful ultrabook."),
        SubCategory("2-in-1 Laptop", 749.99, R.drawable.laptop, "Versatile 2-in-1 laptop."),
        SubCategory("Business Laptop", 999.99, R.drawable.laptop, "Perfect for business professionals."),
        SubCategory("Budget Laptop", 399.99, R.drawable.laptop, "Affordable laptop for everyday use.")
    )),
    Categories("2", "Smart Phones", R.drawable.smartphone, listOf(
        SubCategory("Flagship Phone", 999.99, R.drawable.smartphon, "Top-tier smartphone with all features."),
        SubCategory("Mid-range Phone", 499.99, R.drawable.smartphon, "Great balance of price and features."),
        SubCategory("Budget Phone", 199.99, R.drawable.smartphon, "Affordable smartphone with basic features."),
        SubCategory("Camera Phone", 799.99, R.drawable.smartphon, "Best camera quality in a smartphone."),
        SubCategory("Gaming Phone", 599.99, R.drawable.smartphon, "Smartphone optimized for gaming.")
    )),
    Categories("3", "Smart Watches", R.drawable.smartwatch, listOf(
        SubCategory("Fitness Watch", 199.99, R.drawable.watch, "Track your fitness and health."),
        SubCategory("Luxury Watch", 499.99, R.drawable.watch, "Stylish watch for the elite."),
        SubCategory("Smart Sports Watch", 299.99, R.drawable.watch, "Built for athletes."),
        SubCategory("Kids Smart Watch", 99.99, R.drawable.watch, "Fun and safe for kids."),
        SubCategory("Hybrid Smart Watch", 349.99, R.drawable.watch, "Combines traditional and smart features.")
    )),
    Categories("4", "Tablets", R.drawable.tablet, listOf(
        SubCategory("iOS Tablet", 599.99, R.drawable.tabletimage, "Powerful tablet with iOS."),
        SubCategory("Android Tablet", 399.99, R.drawable.tabletimage, "Versatile Android tablet."),
        SubCategory("Windows Tablet", 699.99, R.drawable.tabletimage, "Tablet with full Windows OS."),
        SubCategory("Budget Tablet", 149.99, R.drawable.tabletimage, "Affordable tablet for media consumption."),
        SubCategory("Drawing Tablet", 249.99, R.drawable.tabletimage, "Perfect for artists and designers.")
    )),
    Categories("5", "Head Phones", R.drawable.headphones, listOf(
        SubCategory("Noise Cancelling Headphones", 299.99, R.drawable.headset, "Experience music without distractions."),
        SubCategory("Wireless Earbuds", 199.99, R.drawable.bleu, "Convenient and portable."),
        SubCategory("Gaming Headset", 129.99, R.drawable.headset, "Designed for gamers with a mic."),
        SubCategory("Studio Headphones", 249.99, R.drawable.bleu, "High-quality audio for professionals."),
        SubCategory("Budget Headphones", 49.99, R.drawable.headset, "Affordable option with decent sound.")
    )),
    Categories("6", "Cameras", R.drawable.camera, listOf(
        SubCategory("DSLR Camera", 899.99, R.drawable.camera_removebg, "Professional photography camera."),
        SubCategory("Mirrorless Camera", 799.99, R.drawable.camera_removebg, "Compact and versatile."),
        SubCategory("Point and Shoot", 299.99, R.drawable.camera_removebg, "Easy-to-use compact camera."),
        SubCategory("Action Camera", 399.99, R.drawable.camera_removebg, "Durable camera for adventures."),
        SubCategory("Camera Accessories", 99.99, R.drawable.camera_removebg, "Essential accessories for your camera.")
    )),
    Categories("7", "Monitors", R.drawable.monitors, listOf(
        SubCategory("4K Monitor", 499.99, R.drawable.monitor, "High-resolution display for clarity."),
        SubCategory("Curved Monitor", 299.99, R.drawable.monitor, "Immersive viewing experience."),
        SubCategory("Gaming Monitor", 399.99, R.drawable.monitor, "High refresh rates for gaming."),
        SubCategory("Budget Monitor", 149.99, R.drawable.monitor, "Affordable option for basic use."),
        SubCategory("Professional Monitor", 799.99, R.drawable.monitor, "Designed for designers and editors.")
    )),
    Categories("8", "Printers", R.drawable.printer, listOf(
        SubCategory("Laser Printer", 299.99, R.drawable.impriment, "Fast and efficient printing."),
        SubCategory("Inkjet Printer", 149.99, R.drawable.impriment, "Great for photos and color."),
        SubCategory("All-in-One Printer", 199.99, R.drawable.impriment, "Print, scan, and copy."),
        SubCategory("Portable Printer", 99.99, R.drawable.impriment, "Compact and travel-friendly."),
        SubCategory("3D Printer", 999.99, R.drawable.impriment, "Create three-dimensional objects.")
    )),
    Categories("9", "Gaming Consoles", R.drawable.game, listOf(
        SubCategory("Next-gen Console", 499.99, R.drawable.gameconsol, "Latest generation gaming console."),
        SubCategory("Handheld Console", 199.99, R.drawable.gameconsol, "Play games on the go."),
        SubCategory("Retro Console", 99.99, R.drawable.gameconsol, "Classic games in a modern format."),
        SubCategory("Console Accessories", 49.99, R.drawable.gameconsol, "Enhance your gaming experience."),
        SubCategory("Virtual Reality Headset", 299.99, R.drawable.gameconsol, "Immersive gaming experience.")
    )),
    Categories("10", "Smart Home Devices", R.drawable.smart, listOf(
        SubCategory("Smart Speaker", 199.99, R.drawable.smarthome, "Voice-activated speaker."),
        SubCategory("Smart Light Bulb", 49.99, R.drawable.smarthome, "Control your lights remotely."),
        SubCategory("Smart Thermostat", 249.99, R.drawable.smarthome, "Efficient temperature control."),
        SubCategory("Security Camera", 149.99, R.drawable.smarthome, "Keep an eye on your home."),
        SubCategory("Smart Door Lock", 299.99, R.drawable.smarthome, "Secure your home with ease.")
    )),
    Categories("11", "Accessories", R.drawable.acc, listOf(
        SubCategory("Phone Case", 19.99, R.drawable.accessoires, "Protect your phone."),
        SubCategory("Charger", 29.99, R.drawable.accessoires, "Fast charging options."),
        SubCategory("Screen Protector", 9.99, R.drawable.accessoires, "Keep your screen scratch-free."),
        SubCategory("Laptop Bag", 49.99, R.drawable.accessoires, "Carry your laptop safely."),
        SubCategory("Mouse Pad", 14.99, R.drawable.accessoires, "Improve your mouse accuracy.")
    ))
)

