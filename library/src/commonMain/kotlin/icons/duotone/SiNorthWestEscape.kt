package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiNorthWestEscape: ImageVector
    get() {
        if (_SiNorthWestEscape != null) {
            return _SiNorthWestEscape!!
        }
        _SiNorthWestEscape = ImageVector.Builder(
            name = "Duotone.SiNorthWestEscape",
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
                moveTo(15f, 7f)
                horizontalLineToRelative(0.6f)
                curveTo(16.93f, 7f, 18f, 8.07f, 18f, 9.4f)
                verticalLineToRelative(6.2f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineTo(9.4f)
                curveTo(8.07f, 18f, 7f, 16.93f, 7f, 15.6f)
                verticalLineTo(15f)
                moveToRelative(7f, -1f)
                lineTo(6f, 6f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(4f)
                moveTo(6f, 6f)
                verticalLineToRelative(4f)
            }
        }.build()

        return _SiNorthWestEscape!!
    }

@Suppress("ObjectPropertyName")
private var _SiNorthWestEscape: ImageVector? = null
