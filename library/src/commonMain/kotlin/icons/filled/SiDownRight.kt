package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiDownRight: ImageVector
    get() {
        if (_SiDownRight != null) {
            return _SiDownRight!!
        }
        _SiDownRight = ImageVector.Builder(
            name = "Filled.SiDownRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                verticalLineToRelative(5.6f)
                arcTo(5.4f, 5.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.4f, 16f)
                horizontalLineToRelative(7.186f)
                lineToRelative(-2.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, 1.414f)
                lineToRelative(4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.414f)
                lineToRelative(-4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.414f, 1.414f)
                lineTo(16.586f, 14f)
                horizontalLineTo(9.4f)
                arcTo(3.4f, 3.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 10.6f)
                close()
            }
        }.build()

        return _SiDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _SiDownRight: ImageVector? = null
