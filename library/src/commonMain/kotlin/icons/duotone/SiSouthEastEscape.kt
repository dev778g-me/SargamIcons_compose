package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiSouthEastEscape: ImageVector
    get() {
        if (_SiSouthEastEscape != null) {
            return _SiSouthEastEscape!!
        }
        _SiSouthEastEscape = ImageVector.Builder(
            name = "Duotone.SiSouthEastEscape",
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
                moveTo(9f, 17f)
                horizontalLineToRelative(-0.6f)
                curveTo(7.07f, 17f, 6f, 15.93f, 6f, 14.6f)
                verticalLineTo(8.4f)
                curveTo(6f, 7.07f, 7.07f, 6f, 8.4f, 6f)
                horizontalLineToRelative(6.2f)
                curveTo(15.93f, 6f, 17f, 7.07f, 17f, 8.4f)
                verticalLineTo(9f)
                moveToRelative(-7f, 1f)
                lineToRelative(8f, 8f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-4f)
                moveToRelative(4f, 0f)
                verticalLineToRelative(-4f)
            }
        }.build()

        return _SiSouthEastEscape!!
    }

@Suppress("ObjectPropertyName")
private var _SiSouthEastEscape: ImageVector? = null
