package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiStopCircle: ImageVector
    get() {
        if (_SiStopCircle != null) {
            return _SiStopCircle!!
        }
        _SiStopCircle = ImageVector.Builder(
            name = "Regular.SiStopCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 22f)
                curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
                reflectiveCurveTo(17.523f, 2f, 12f, 2f)
                reflectiveCurveTo(2f, 6.477f, 2f, 12f)
                reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.2f, 9f)
                horizontalLineTo(9.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineToRelative(4.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 0.8f)
                horizontalLineToRelative(4.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, -0.8f)
                verticalLineTo(9.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                close()
            }
        }.build()

        return _SiStopCircle!!
    }

@Suppress("ObjectPropertyName")
private var _SiStopCircle: ImageVector? = null
