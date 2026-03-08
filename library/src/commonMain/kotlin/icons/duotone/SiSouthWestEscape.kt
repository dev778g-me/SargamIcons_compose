package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiSouthWestEscape: ImageVector
    get() {
        if (_SiSouthWestEscape != null) {
            return _SiSouthWestEscape!!
        }
        _SiSouthWestEscape = ImageVector.Builder(
            name = "Duotone.SiSouthWestEscape",
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
                moveTo(15f, 17f)
                horizontalLineToRelative(0.6f)
                curveToRelative(1.33f, 0f, 2.4f, -1.07f, 2.4f, -2.4f)
                verticalLineTo(8.4f)
                curveTo(18f, 7.07f, 16.93f, 6f, 15.6f, 6f)
                horizontalLineTo(9.4f)
                curveTo(8.07f, 6f, 7f, 7.07f, 7f, 8.4f)
                verticalLineTo(9f)
                moveToRelative(7f, 1f)
                lineToRelative(-8f, 8f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(4f)
                moveToRelative(-4f, 0f)
                verticalLineToRelative(-4f)
            }
        }.build()

        return _SiSouthWestEscape!!
    }

@Suppress("ObjectPropertyName")
private var _SiSouthWestEscape: ImageVector? = null
