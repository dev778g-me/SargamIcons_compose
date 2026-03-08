package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiYouTube: ImageVector
    get() {
        if (_SiYouTube != null) {
            return _SiYouTube!!
        }
        _SiYouTube = ImageVector.Builder(
            name = "Duotone.SiYouTube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.54f, 6.42f)
                arcToRelative(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.945f, -1.957f)
                curveTo(18.88f, 4f, 12f, 4f, 12f, 4f)
                reflectiveCurveToRelative(-6.88f, 0f, -8.595f, 0.463f)
                arcTo(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.46f, 6.42f)
                curveTo(1f, 8.148f, 1f, 11.75f, 1f, 11.75f)
                reflectiveCurveToRelative(0f, 3.602f, 0.46f, 5.33f)
                arcToRelative(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.945f, 1.958f)
                curveTo(5.121f, 19.5f, 12f, 19.5f, 12f, 19.5f)
                reflectiveCurveToRelative(6.88f, 0f, 8.595f, -0.462f)
                arcToRelative(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.945f, -1.958f)
                curveToRelative(0.46f, -1.726f, 0.46f, -5.33f, 0.46f, -5.33f)
                reflectiveCurveToRelative(0f, -3.602f, -0.46f, -5.33f)
                moveTo(9.75f, 8.479f)
                verticalLineToRelative(6.542f)
                lineToRelative(5.75f, -3.271f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.595f, 4.463f)
                arcTo(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.54f, 6.42f)
                curveToRelative(0.46f, 1.728f, 0.46f, 5.33f, 0.46f, 5.33f)
                reflectiveCurveToRelative(0f, 3.604f, -0.46f, 5.33f)
                arcToRelative(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.945f, 1.958f)
                curveTo(18.88f, 19.5f, 12f, 19.5f, 12f, 19.5f)
                reflectiveCurveToRelative(-6.879f, 0f, -8.595f, -0.462f)
                arcTo(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, 17.08f)
                curveTo(1f, 15.353f, 1f, 11.75f, 1f, 11.75f)
                reflectiveCurveToRelative(0f, -3.602f, 0.46f, -5.33f)
                arcToRelative(2.77f, 2.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.945f, -1.957f)
                curveTo(5.12f, 4f, 12f, 4f, 12f, 4f)
                reflectiveCurveToRelative(6.88f, 0f, 8.595f, 0.463f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.75f, 15.021f)
                verticalLineTo(8.48f)
                lineToRelative(5.75f, 3.271f)
                close()
            }
        }.build()

        return _SiYouTube!!
    }

@Suppress("ObjectPropertyName")
private var _SiYouTube: ImageVector? = null
