package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiDragIndicatorAlt: ImageVector
    get() {
        if (_SiDragIndicatorAlt != null) {
            return _SiDragIndicatorAlt!!
        }
        _SiDragIndicatorAlt = ImageVector.Builder(
            name = "Duotone.SiDragIndicatorAlt",
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
                moveTo(15f, 10f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, 4f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, -8f)
                horizontalLineToRelative(1f)
                moveToRelative(-7f, 4f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, 4f)
                horizontalLineToRelative(1f)
                moveToRelative(5f, 4f)
                horizontalLineToRelative(1f)
                moveToRelative(-7f, 0f)
                horizontalLineToRelative(1f)
                moveTo(9f, 6f)
                horizontalLineToRelative(1f)
            }
        }.build()

        return _SiDragIndicatorAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiDragIndicatorAlt: ImageVector? = null
