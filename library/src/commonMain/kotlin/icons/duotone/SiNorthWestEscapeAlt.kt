package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiNorthWestEscapeAlt: ImageVector
    get() {
        if (_SiNorthWestEscapeAlt != null) {
            return _SiNorthWestEscapeAlt!!
        }
        _SiNorthWestEscapeAlt = ImageVector.Builder(
            name = "Duotone.SiNorthWestEscapeAlt",
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
                moveTo(14f, 14f)
                lineTo(6f, 6f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(4f)
                moveToRelative(0f, -4f)
                horizontalLineToRelative(4f)
                moveToRelative(5f, 3f)
                horizontalLineToRelative(0.6f)
                curveToRelative(1.33f, 0f, 2.4f, 1.07f, 2.4f, 2.4f)
                verticalLineToRelative(4.2f)
                curveToRelative(0f, 1.33f, -1.07f, 2.4f, -2.4f, 2.4f)
                horizontalLineToRelative(-4.2f)
                curveTo(10.07f, 18f, 9f, 16.93f, 9f, 15.6f)
                verticalLineTo(15f)
            }
        }.build()

        return _SiNorthWestEscapeAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiNorthWestEscapeAlt: ImageVector? = null
