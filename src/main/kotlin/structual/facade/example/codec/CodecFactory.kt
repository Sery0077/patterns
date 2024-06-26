package structual.facade.example.codec

import structual.facade.example.media_library.VideoFile

object CodecFactory {

    fun extract(file: VideoFile): Codec {
        return when (file.codecName) {
            "mp4" -> MP4Codec()
            "ogg" -> OggCodec()
            else -> throw IllegalArgumentException("Unknown codec ${file.codecName}")
        }
    }
}