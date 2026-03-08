package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiNorthEastEscapeAlt: ImageVector
    get() {
        if (_SiNorthEastEscapeAlt != null) {
            return _SiNorthEastEscapeAlt!!
        }
        _SiNorthEastEscapeAlt = ImageVector.Builder(
            name = "Regular.SiNorthEastEscapeAlt",
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
                moveToRelative(10f, 14f)
                lineToRelative(8f, -8f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(4f)
                moveToRelative(0f, -4f)
                horizontalLineToRelative(-4f)
                moveTo(9f, 9f)
                horizontalLineToRelative(-0.6f)
                curveTo(7.07f, 9f, 6f, 10.07f, 6f, 11.4f)
                verticalLineToRelative(4.2f)
                curveTo(6f, 16.93f, 7.07f, 18f, 8.4f, 18f)
                horizontalLineToRelative(4.2f)
                curveToRelative(1.33f, 0f, 2.4f, -1.07f, 2.4f, -2.4f)
                verticalLineTo(15f)
            }
        }.build()

        return _SiNorthEastEscapeAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiNorthEastEscapeAlt: ImageVector? = null
