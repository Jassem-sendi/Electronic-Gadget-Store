package com.example.storev2.home.data

import com.example.storev2.R

data class Categories(
    val id: String,
    val catName: String,
    val catImage: Int,
    val subCategories : List<Product>
)

data class Product(
    val name: String,
    val price: Double,
    val image: Int,
    val description: String,
    val categoryId: String = "1",
)

val ListOfProducts = listOf(
    Product("Gaming Laptop", 1299.99, R.drawable.laptop, "High performance gaming laptop.", "1"),
    Product("Ultrabook", 899.99, R.drawable.laptop, "Lightweight and powerful ultrabook.", "1"),
    Product("2-in-1 Laptop", 749.99, R.drawable.laptop, "Versatile 2-in-1 laptop.", "2"),
    Product("Business Laptop", 999.99, R.drawable.laptop, "Perfect for business professionals.", "3"),
    Product("Budget Laptop", 399.99, R.drawable.laptop, "Affordable laptop for everyday use.", "4")
)

val ListOfCategories = listOf(
    //Categories("0", "All", R.drawable.all, listOf()),
    Categories("1", "Laptops", R.drawable.laptops, listOf(
        Product("Gaming Laptop", 1299.99, R.drawable.laptop, "High performance gaming laptop."),
        Product("Ultrabook", 899.99, R.drawable.laptop, "Lightweight and powerful ultrabook."),
        Product("2-in-1 Laptop", 749.99, R.drawable.laptop, "Versatile 2-in-1 laptop."),
        Product("Business Laptop", 999.99, R.drawable.laptop, "Perfect for business professionals."),
        Product("Budget Laptop", 399.99, R.drawable.laptop, "Affordable laptop for everyday use.")
    )),
    Categories("2", "Smart Phones", R.drawable.smartphone, listOf(
        Product("Flagship Phone", 999.99, R.drawable.smartphon, "Top-tier smartphone with all features."),
        Product("Mid-range Phone", 499.99, R.drawable.smartphon, "Great balance of price and features."),
        Product("Budget Phone", 199.99, R.drawable.smartphon, "Affordable smartphone with basic features."),
        Product("Camera Phone", 799.99, R.drawable.smartphon, "Best camera quality in a smartphone."),
        Product("Gaming Phone", 599.99, R.drawable.smartphon, "Smartphone optimized for gaming.")
    )),
    Categories("3", "Smart Watches", R.drawable.smartwatch, listOf(
        Product("Fitness Watch", 199.99, R.drawable.watch, "Track your fitness and health."),
        Product("Luxury Watch", 499.99, R.drawable.watch, "Stylish watch for the elite."),
        Product("Smart Sports Watch", 299.99, R.drawable.watch, "Built for athletes."),
        Product("Kids Smart Watch", 99.99, R.drawable.watch, "Fun and safe for kids."),
        Product("Hybrid Smart Watch", 349.99, R.drawable.watch, "Combines traditional and smart features.")
    )),
    Categories("4", "Tablets", R.drawable.tablet, listOf(
        Product("iOS Tablet", 599.99, R.drawable.tabletimage, "Powerful tablet with iOS."),
        Product("Android Tablet", 399.99, R.drawable.tabletimage, "Versatile Android tablet."),
        Product("Windows Tablet", 699.99, R.drawable.tabletimage, "Tablet with full Windows OS."),
        Product("Budget Tablet", 149.99, R.drawable.tabletimage, "Affordable tablet for media consumption."),
        Product("Drawing Tablet", 249.99, R.drawable.tabletimage, "Perfect for artists and designers.")
    )),
    Categories("5", "Head Phones", R.drawable.headphones, listOf(
        Product("Noise Cancelling Headphones", 299.99, R.drawable.headset, "Experience music without distractions."),
        Product("Wireless Earbuds", 199.99, R.drawable.bleu, "Convenient and portable."),
        Product("Gaming Headset", 129.99, R.drawable.headset, "Designed for gamers with a mic."),
        Product("Studio Headphones", 249.99, R.drawable.bleu, "High-quality audio for professionals."),
        Product("Budget Headphones", 49.99, R.drawable.headset, "Affordable option with decent sound.")
    )),
    Categories("6", "Cameras", R.drawable.camera, listOf(
        Product("DSLR Camera", 899.99, R.drawable.camera_removebg, "Professional photography camera."),
        Product("Mirrorless Camera", 799.99, R.drawable.camera_removebg, "Compact and versatile."),
        Product("Point and Shoot", 299.99, R.drawable.camera_removebg, "Easy-to-use compact camera."),
        Product("Action Camera", 399.99, R.drawable.camera_removebg, "Durable camera for adventures."),
        Product("Camera Accessories", 99.99, R.drawable.camera_removebg, "Essential accessories for your camera.")
    )),
    Categories("7", "Monitors", R.drawable.monitors, listOf(
        Product("4K Monitor", 499.99, R.drawable.monitor, "High-resolution display for clarity."),
        Product("Curved Monitor", 299.99, R.drawable.monitor, "Immersive viewing experience."),
        Product("Gaming Monitor", 399.99, R.drawable.monitor, "High refresh rates for gaming."),
        Product("Budget Monitor", 149.99, R.drawable.monitor, "Affordable option for basic use."),
        Product("Professional Monitor", 799.99, R.drawable.monitor, "Designed for designers and editors.")
    )),
    Categories("8", "Printers", R.drawable.printer, listOf(
        Product("Laser Printer", 299.99, R.drawable.impriment, "Fast and efficient printing."),
        Product("Inkjet Printer", 149.99, R.drawable.impriment, "Great for photos and color."),
        Product("All-in-One Printer", 199.99, R.drawable.impriment, "Print, scan, and copy."),
        Product("Portable Printer", 99.99, R.drawable.impriment, "Compact and travel-friendly."),
        Product("3D Printer", 999.99, R.drawable.impriment, "Create three-dimensional objects.")
    )),
    Categories("9", "Gaming Consoles", R.drawable.game, listOf(
        Product("Next-gen Console", 499.99, R.drawable.gameconsol, "Latest generation gaming console."),
        Product("Handheld Console", 199.99, R.drawable.gameconsol, "Play games on the go."),
        Product("Retro Console", 99.99, R.drawable.gameconsol, "Classic games in a modern format."),
        Product("Console Accessories", 49.99, R.drawable.gameconsol, "Enhance your gaming experience."),
        Product("Virtual Reality Headset", 299.99, R.drawable.gameconsol, "Immersive gaming experience.")
    )),
    Categories("10", "Smart Home Devices", R.drawable.smart, listOf(
        Product("Smart Speaker", 199.99, R.drawable.smarthome, "Voice-activated speaker."),
        Product("Smart Light Bulb", 49.99, R.drawable.smarthome, "Control your lights remotely."),
        Product("Smart Thermostat", 249.99, R.drawable.smarthome, "Efficient temperature control."),
        Product("Security Camera", 149.99, R.drawable.smarthome, "Keep an eye on your home."),
        Product("Smart Door Lock", 299.99, R.drawable.smarthome, "Secure your home with ease.")
    )),
    Categories("11", "Accessories", R.drawable.acc, listOf(
        Product("Phone Case", 19.99, R.drawable.accessoires, "Protect your phone."),
        Product("Charger", 29.99, R.drawable.accessoires, "Fast charging options."),
        Product("Screen Protector", 9.99, R.drawable.accessoires, "Keep your screen scratch-free."),
        Product("Laptop Bag", 49.99, R.drawable.accessoires, "Carry your laptop safely."),
        Product("Mouse Pad", 14.99, R.drawable.accessoires, "Improve your mouse accuracy.")
    ))
)

