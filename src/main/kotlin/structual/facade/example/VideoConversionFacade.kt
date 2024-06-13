package structual.facade.example

import structual.facade.example.codec.CodecFactory
import structual.facade.example.codec.MP4Codec
import structual.facade.example.codec.OggCodec
import structual.facade.example.media_library.AudioMixer
import structual.facade.example.media_library.BitrateReader.convert
import structual.facade.example.media_library.BitrateReader.read
import structual.facade.example.media_library.VideoFile
import java.io.File

class VideoConversionFacade {
    fun convertVideo(fileName: String, format: String): File {
        println("VideoConversionFacade: conversion started.")
        val videoFile = VideoFile(fileName)
        val sourceCodec = CodecFactory.extract(videoFile)
        val destinationCodec = if (format == "mp4") {
            MP4Codec()
        } else {
            OggCodec()
        }
        val buffer = read(videoFile, sourceCodec)
        val intermediateResult = convert(buffer, destinationCodec)
        val result: File = AudioMixer.fix(intermediateResult)
        println("VideoConversionFacade: conversion completed.")
        return result
    }
}