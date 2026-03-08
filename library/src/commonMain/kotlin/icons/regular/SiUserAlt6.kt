package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiUserAlt6: ImageVector
    get() {
        if (_SiUserAlt6 != null) {
            return _SiUserAlt6!!
        }
        _SiUserAlt6 = ImageVector.Builder(
            name = "Regular.SiUserAlt6",
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
                moveTo(5.4f, 21f)
                horizontalLineToRelative(13.2f)
                curveToRelative(0.636f, 0f, 1.247f, -0.24f, 1.697f, -0.67f)
                curveToRelative(0.45f, -0.428f, 0.703f, -1.01f, 0.703f, -1.616f)
                curveToRelative(0f, -1.515f, -0.632f, -2.969f, -1.757f, -4.04f)
                arcTo(6.16f, 6.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 13f)
                horizontalLineTo(9f)
                arcToRelative(6.16f, 6.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.243f, 1.674f)
                curveTo(3.632f, 15.745f, 3f, 17.199f, 3f, 18.714f)
                curveToRelative(0f, 0.607f, 0.253f, 1.188f, 0.703f, 1.617f)
                curveToRelative(0.45f, 0.428f, 1.06f, 0.669f, 1.697f, 0.669f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
            }
        }.build()

        return _SiUserAlt6!!
    }

@Suppress("ObjectPropertyName")
private var _SiUserAlt6: ImageVector? = null
