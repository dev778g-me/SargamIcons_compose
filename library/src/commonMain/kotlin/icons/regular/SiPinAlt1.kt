package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiPinAlt1: ImageVector
    get() {
        if (_SiPinAlt1 != null) {
            return _SiPinAlt1!!
        }
        _SiPinAlt1 = ImageVector.Builder(
            name = "Regular.SiPinAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17.455f, 16.986f)
                curveToRelative(2.736f, 0.487f, 4.545f, 1.33f, 4.545f, 2.287f)
                curveTo(22f, 20.779f, 17.523f, 22f, 12f, 22f)
                reflectiveCurveTo(2f, 20.78f, 2f, 19.273f)
                curveToRelative(0f, -0.958f, 1.81f, -1.8f, 4.545f, -2.287f)
                moveToRelative(10.383f, -12.92f)
                curveToRelative(2.757f, 2.772f, 2.757f, 7.208f, 0.037f, 9.944f)
                lineTo(12.002f, 19f)
                lineTo(7.04f, 14.01f)
                arcToRelative(7.034f, 7.034f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -9.908f)
                lineToRelative(0.037f, -0.036f)
                arcToRelative(6.906f, 6.906f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.85f, 0f)
                moveToRelative(0f, 0f)
                quadToRelative(-0.055f, -0.055f, 0f, 0f)
                moveTo(14f, 8.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            }
        }.build()

        return _SiPinAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiPinAlt1: ImageVector? = null
