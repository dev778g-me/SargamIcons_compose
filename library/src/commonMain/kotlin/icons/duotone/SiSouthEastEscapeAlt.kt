package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiSouthEastEscapeAlt: ImageVector
    get() {
        if (_SiSouthEastEscapeAlt != null) {
            return _SiSouthEastEscapeAlt!!
        }
        _SiSouthEastEscapeAlt = ImageVector.Builder(
            name = "Duotone.SiSouthEastEscapeAlt",
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
                moveToRelative(10f, 10f)
                lineToRelative(8f, 8f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(-4f)
                moveToRelative(0f, 4f)
                horizontalLineToRelative(-4f)
                moveToRelative(-5f, -3f)
                horizontalLineToRelative(-0.6f)
                curveTo(7.07f, 15f, 6f, 13.93f, 6f, 12.6f)
                verticalLineTo(8.4f)
                curveTo(6f, 7.07f, 7.07f, 6f, 8.4f, 6f)
                horizontalLineToRelative(4.2f)
                curveTo(13.93f, 6f, 15f, 7.07f, 15f, 8.4f)
                verticalLineTo(9f)
            }
        }.build()

        return _SiSouthEastEscapeAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiSouthEastEscapeAlt: ImageVector? = null
