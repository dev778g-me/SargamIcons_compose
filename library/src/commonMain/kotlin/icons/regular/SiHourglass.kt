package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiHourglass: ImageVector
    get() {
        if (_SiHourglass != null) {
            return _SiHourglass!!
        }
        _SiHourglass = ImageVector.Builder(
            name = "Regular.SiHourglass",
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
                moveToRelative(12f, 12f)
                lineToRelative(3.136f, -2.391f)
                curveTo(16.318f, 8.7f, 17f, 7.265f, 17f, 5.735f)
                lineTo(17f, 2f)
                lineTo(7f, 2f)
                verticalLineToRelative(3.735f)
                curveToRelative(0f, 1.53f, 0.682f, 2.965f, 1.864f, 3.874f)
                close()
                moveTo(12f, 12f)
                lineTo(8.864f, 14.391f)
                curveTo(7.682f, 15.3f, 7f, 16.735f, 7f, 18.265f)
                lineTo(7f, 22f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3.735f)
                curveToRelative(0f, -1.53f, -0.682f, -2.965f, -1.864f, -3.874f)
                close()
                moveTo(7f, 18f)
                lineTo(12f, 17f)
                lineTo(17f, 18f)
                moveTo(5f, 2f)
                horizontalLineToRelative(14f)
                moveTo(5f, 22f)
                horizontalLineToRelative(14f)
            }
        }.build()

        return _SiHourglass!!
    }

@Suppress("ObjectPropertyName")
private var _SiHourglass: ImageVector? = null
