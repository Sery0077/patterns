package facade.example.media_library

data class VideoFile(
    val name: String,
    val codecName: String = name.substringAfterLast("."),
)
