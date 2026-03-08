package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiSouthWestEscapeAlt: ImageVector
    get() {
        if (_SiSouthWestEscapeAlt != null) {
            return _SiSouthWestEscapeAlt!!
        }
        _SiSouthWestEscapeAlt = ImageVector.Builder(
            name = "Regular.SiSouthWestEscapeAlt",
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
                moveToRelative(14f, 10f)
                lineToRelative(-8f, 8f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(-4f)
                moveToRelative(0f, 4f)
                horizontalLineToRelative(4f)
                moveToRelative(5f, -3f)
                horizontalLineToRelative(0.6f)
                curveToRelative(1.33f, 0f, 2.4f, -1.07f, 2.4f, -2.4f)
                verticalLineTo(8.4f)
                curveTo(18f, 7.07f, 16.93f, 6f, 15.6f, 6f)
                horizontalLineToRelative(-4.2f)
                curveTo(10.07f, 6f, 9f, 7.07f, 9f, 8.4f)
                verticalLineTo(9f)
            }
        }.build()

        return _SiSouthWestEscapeAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiSouthWestEscapeAlt: ImageVector? = null
