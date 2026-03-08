package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiLeftRight: ImageVector
    get() {
        if (_SiLeftRight != null) {
            return _SiLeftRight!!
        }
        _SiLeftRight = ImageVector.Builder(
            name = "Duotone.SiLeftRight",
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
                moveTo(21f, 12f)
                horizontalLineTo(3f)
                moveToRelative(18f, 0f)
                lineToRelative(-4f, -4f)
                moveToRelative(4f, 4f)
                lineToRelative(-4f, 4f)
                moveTo(3f, 12f)
                lineToRelative(4f, -4f)
                moveToRelative(-4f, 4f)
                lineToRelative(4f, 4f)
            }
        }.build()

        return _SiLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _SiLeftRight: ImageVector? = null
