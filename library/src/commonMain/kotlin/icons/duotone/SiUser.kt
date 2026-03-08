package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiUser: ImageVector
    get() {
        if (_SiUser != null) {
            return _SiUser!!
        }
        _SiUser = ImageVector.Builder(
            name = "Duotone.SiUser",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(19.523f, 21.99f)
                horizontalLineTo(4.488f)
                curveToRelative(-1.503f, 0f, -2.663f, -1.134f, -2.466f, -2.624f)
                lineToRelative(0.114f, -0.869f)
                curveToRelative(0.207f, -1.2f, 1.305f, -1.955f, 2.497f, -2.214f)
                lineTo(11.928f, 15f)
                horizontalLineToRelative(0.144f)
                lineToRelative(7.295f, 1.283f)
                curveToRelative(1.212f, 0.28f, 2.29f, 0.993f, 2.497f, 2.214f)
                lineToRelative(0.114f, 0.88f)
                curveToRelative(0.197f, 1.49f, -0.963f, 2.623f, -2.466f, 2.623f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.523f, 21.99f)
                horizontalLineTo(4.488f)
                curveToRelative(-1.503f, 0f, -2.663f, -1.134f, -2.466f, -2.624f)
                lineToRelative(0.114f, -0.869f)
                curveToRelative(0.207f, -1.2f, 1.305f, -1.955f, 2.497f, -2.214f)
                lineTo(11.928f, 15f)
                horizontalLineToRelative(0.144f)
                lineToRelative(7.295f, 1.283f)
                curveToRelative(1.212f, 0.28f, 2.29f, 0.993f, 2.497f, 2.214f)
                lineToRelative(0.114f, 0.88f)
                curveToRelative(0.197f, 1.49f, -0.963f, 2.623f, -2.466f, 2.623f)
                close()
                moveTo(17f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 7f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
            }
        }.build()

        return _SiUser!!
    }

@Suppress("ObjectPropertyName")
private var _SiUser: ImageVector? = null
