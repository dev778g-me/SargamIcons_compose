package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiStop: ImageVector
    get() {
        if (_SiStop != null) {
            return _SiStop!!
        }
        _SiStop = ImageVector.Builder(
            name = "Filled.SiStop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.2f, 3f)
                horizontalLineTo(3.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineToRelative(16.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 0.8f)
                horizontalLineToRelative(16.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, -0.8f)
                verticalLineTo(3.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
            }
        }.build()

        return _SiStop!!
    }

@Suppress("ObjectPropertyName")
private var _SiStop: ImageVector? = null
