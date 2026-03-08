package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiNorthEastEscape: ImageVector
    get() {
        if (_SiNorthEastEscape != null) {
            return _SiNorthEastEscape!!
        }
        _SiNorthEastEscape = ImageVector.Builder(
            name = "Regular.SiNorthEastEscape",
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
                moveTo(9f, 7f)
                horizontalLineToRelative(-0.6f)
                curveTo(7.07f, 7f, 6f, 8.07f, 6f, 9.4f)
                verticalLineToRelative(6.2f)
                curveTo(6f, 16.93f, 7.07f, 18f, 8.4f, 18f)
                horizontalLineToRelative(6.2f)
                curveToRelative(1.33f, 0f, 2.4f, -1.07f, 2.4f, -2.4f)
                verticalLineTo(15f)
                moveToRelative(-7f, -1f)
                lineToRelative(8f, -8f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-4f)
                moveToRelative(4f, 0f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _SiNorthEastEscape!!
    }

@Suppress("ObjectPropertyName")
private var _SiNorthEastEscape: ImageVector? = null
