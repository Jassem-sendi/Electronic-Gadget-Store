
package com.example.storev2.home.data

import com.example.storev2.R

data class Categories(
    val id: String,
    val catName: String,
    val catImage: Int
)

data class Product(
    val name: String,
    val price: Double,
    val image: Int,
    val description: String,
    val categoryId: String
)
val filter = listOf(
    "new",
    "featured",
    "must see",
    "top selected"
)
val ListOfCategories = listOf(
    Categories("0", "All", R.drawable.alliconcat),
    Categories("1", "Laptops", R.drawable.laptopicon),
    Categories("2", "Smart Phones", R.drawable.smartphoneicon),
    Categories("3", "Smart Watches", R.drawable.smartwatchicon),
    Categories("4", "Tablets", R.drawable.tableticon),
    Categories("5", "Head Phones", R.drawable.headphonesicon),
    Categories("6", "Cameras", R.drawable.cameraicon),
    Categories("7", "Monitors", R.drawable.monitoricon),
    Categories("8", "Printers", R.drawable.printericon),
    Categories("9", "Gaming Consoles", R.drawable.gameicon),
    Categories("10", "Smart Home Devices", R.drawable.devicesicon),
    Categories("11", "Accessories", R.drawable.acc)
)

val ListOfProducts = listOf(
    // Laptops
    Product("Gaming Laptop", 1299.99, R.drawable.laptop, "High performance gaming laptop.", "1"),
    Product("Ultrabook", 899.99, R.drawable.laptop, "Lightweight and powerful ultrabook.", "1"),
    Product("2-in-1 Laptop", 749.99, R.drawable.laptop, "Versatile 2-in-1 laptop.", "1"),
    Product("Business Laptop", 999.99, R.drawable.laptop, "Perfect for business professionals.", "1"),
    Product("Budget Laptop", 399.99, R.drawable.laptop, "Affordable laptop for everyday use.", "1"),

    // Smart Phones
    Product("Flagship Phone", 999.99, R.drawable.smartphon, "Top-tier smartphone with all features.", "2"),
    Product("Mid-range Phone", 499.99, R.drawable.smartphon, "Great balance of price and features.", "2"),
    Product("Budget Phone", 199.99, R.drawable.smartphon, "Affordable smartphone with basic features.", "2"),
    Product("Camera Phone", 799.99, R.drawable.smartphon, "Best camera quality in a smartphone.", "2"),
    Product("Gaming Phone", 599.99, R.drawable.smartphon, "Smartphone optimized for gaming.", "2"),

    // Smart Watches
    Product("Fitness Watch", 199.99, R.drawable.watch, "Track your fitness and health.", "3"),
    Product("Luxury Watch", 499.99, R.drawable.watch, "Stylish watch for the elite.", "3"),
    Product("Smart Sports Watch", 299.99, R.drawable.watch, "Built for athletes.", "3"),
    Product("Kids Smart Watch", 99.99, R.drawable.watch, "Fun and safe for kids.", "3"),
    Product("Hybrid Smart Watch", 349.99, R.drawable.watch, "Combines traditional and smart features.", "3"),

    // Tablets
    Product("iOS Tablet", 599.99, R.drawable.tabletimage, "Powerful tablet with iOS.", "4"),
    Product("Android Tablet", 399.99, R.drawable.tabletimage, "Versatile Android tablet.", "4"),
    Product("Windows Tablet", 699.99, R.drawable.tabletimage, "Tablet with full Windows OS.", "4"),
    Product("Budget Tablet", 149.99, R.drawable.tabletimage, "Affordable tablet for media consumption.", "4"),
    Product("Drawing Tablet", 249.99, R.drawable.tabletimage, "Perfect for artists and designers.", "4"),

    // Headphones
    Product("Noise Cancelling Headphones", 299.99, R.drawable.headset, "Experience music without distractions.", "5"),
    Product("Wireless Earbuds", 199.99, R.drawable.bleu, "Convenient and portable.", "5"),
    Product("Gaming Headset", 129.99, R.drawable.headset, "Designed for gamers with a mic.", "5"),
    Product("Studio Headphones", 249.99, R.drawable.bleu, "High-quality audio for professionals.", "5"),
    Product("Budget Headphones", 49.99, R.drawable.headset, "Affordable option with decent sound.", "5"),

    // Cameras
    Product("DSLR Camera", 899.99, R.drawable.camera_removebg, "Professional photography camera.", "6"),
    Product("Mirrorless Camera", 799.99, R.drawable.camera_removebg, "Compact and versatile.", "6"),
    Product("Point and Shoot", 299.99, R.drawable.camera_removebg, "Easy-to-use compact camera.", "6"),
    Product("Action Camera", 399.99, R.drawable.camera_removebg, "Durable camera for adventures.", "6"),
    Product("Camera Accessories", 99.99, R.drawable.camera_removebg, "Essential accessories for your camera.", "6"),
    // Monitors
    Product("4K Monitor", 499.99, R.drawable.monitor, "High-resolution display for clarity.", "7"),
    Product("Curved Monitor", 299.99, R.drawable.monitor, "Immersive viewing experience.", "7"),
    Product("Gaming Monitor", 399.99, R.drawable.monitor, "High refresh rates for gaming.", "7"),
    Product("Budget Monitor", 149.99, R.drawable.monitor, "Affordable option for basic use.", "7"),
    Product("Professional Monitor", 799.99, R.drawable.monitor, "Designed for designers and editors.", "7"),

    // Printers
    Product("Laser Printer", 299.99, R.drawable.impriment, "Fast and efficient printing.", "8"),
    Product("Inkjet Printer", 149.99, R.drawable.impriment, "Great for photos and color.", "8"),
    Product("All-in-One Printer", 199.99, R.drawable.impriment, "Print, scan, and copy.", "8"),
    Product("Portable Printer", 99.99, R.drawable.impriment, "Compact and travel-friendly.", "8"),
    Product("3D Printer", 999.99, R.drawable.impriment, "Create three-dimensional objects.", "8"),

    // Gaming Consoles
    Product("Next-gen Console", 499.99, R.drawable.gameconsol, "Latest generation gaming console.", "9"),
    Product("Handheld Console", 199.99, R.drawable.gameconsol, "Play games on the go.", "9"),
    Product("Retro Console", 99.99, R.drawable.gameconsol, "Classic games in a modern format.", "9"),
    Product("Console Accessories", 49.99, R.drawable.gameconsol, "Enhance your gaming experience.", "9"),
    Product("Virtual Reality Headset", 299.99, R.drawable.gameconsol, "Immersive gaming experience.", "9"),

    // Smart Home Devices
    Product("Smart Speaker", 199.99, R.drawable.smarthome, "Voice-activated speaker.", "10"),
    Product("Smart Light Bulb", 49.99, R.drawable.smarthome, "Control your lights remotely.", "10"),
    Product("Smart Thermostat", 249.99, R.drawable.smarthome, "Efficient temperature control.", "10"),
    Product("Security Camera", 149.99, R.drawable.smarthome, "Keep an eye on your home.", "10"),
    Product("Smart Door Lock", 299.99, R.drawable.smarthome, "Secure your home with ease.", "10"),

    // Accessories
    Product("Phone Case", 19.99, R.drawable.accessoires, "Protect your phone.", "11"),
    Product("Charger", 29.99, R.drawable.accessoires, "Fast charging options.", "11"),
    Product("Screen Protector", 9.99, R.drawable.accessoires, "Keep your screen scratch-free.", "11"),
    Product("Laptop Bag", 49.99, R.drawable.accessoires, "Carry your laptop safely.", "11"),
    Product("Mouse Pad", 14.99, R.drawable.accessoires, "Improve your mouse accuracy.", "11")

)

// Function to get products by category ID
fun getProductsByCategoryId(categoryId: String): List<Product> {
    return ListOfProducts.filter { it.categoryId == categoryId }
}
