package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiLeftUp: ImageVector
    get() {
        if (_SiLeftUp != null) {
            return _SiLeftUp!!
        }
        _SiLeftUp = ImageVector.Builder(
            name = "Duotone.SiLeftUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(9f, 5f)
                verticalLineToRelative(9.6f)
                arcToRelative(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.4f, 4.4f)
                horizontalLineTo(19f)
                moveTo(9f, 5f)
                lineTo(5f, 9f)
                moveToRelative(4f, -4f)
                lineToRelative(4f, 4f)
            }
        }.build()

        return _SiLeftUp!!
    }

@Suppress("ObjectPropertyName")
private var _SiLeftUp: ImageVector? = null
