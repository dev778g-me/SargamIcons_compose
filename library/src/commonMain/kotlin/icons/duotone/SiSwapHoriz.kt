package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiSwapHoriz: ImageVector
    get() {
        if (_SiSwapHoriz != null) {
            return _SiSwapHoriz!!
        }
        _SiSwapHoriz = ImageVector.Builder(
            name = "Duotone.SiSwapHoriz",
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
                moveTo(7f, 11f)
                lineTo(3f, 7f)
                moveToRelative(0f, 0f)
                lineToRelative(4f, -4f)
                moveTo(3f, 7f)
                horizontalLineToRelative(18f)
                moveToRelative(-4f, 14f)
                lineToRelative(4f, -4f)
                moveToRelative(0f, 0f)
                lineToRelative(-4f, -4f)
                moveToRelative(4f, 4f)
                horizontalLineTo(3f)
            }
        }.build()

        return _SiSwapHoriz!!
    }

@Suppress("ObjectPropertyName")
private var _SiSwapHoriz: ImageVector? = null
