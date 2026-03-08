package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiLeftTwoHeaded: ImageVector
    get() {
        if (_SiLeftTwoHeaded != null) {
            return _SiLeftTwoHeaded!!
        }
        _SiLeftTwoHeaded = ImageVector.Builder(
            name = "Filled.SiLeftTwoHeaded",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.293f, 7.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.414f, 1.414f)
                lineTo(11.414f, 11f)
                horizontalLineTo(20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-8.586f)
                lineToRelative(2.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, 1.414f)
                lineTo(8.586f, 13f)
                horizontalLineTo(6.414f)
                lineToRelative(2.293f, 2.293f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.414f, 1.414f)
                lineToRelative(-4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.414f)
                lineToRelative(4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.414f, 1.414f)
                lineTo(6.414f, 11f)
                horizontalLineToRelative(2.172f)
                close()
            }
        }.build()

        return _SiLeftTwoHeaded!!
    }

@Suppress("ObjectPropertyName")
private var _SiLeftTwoHeaded: ImageVector? = null
