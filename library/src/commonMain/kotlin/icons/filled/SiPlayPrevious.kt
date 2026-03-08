package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiPlayPrevious: ImageVector
    get() {
        if (_SiPlayPrevious != null) {
            return _SiPlayPrevious!!
        }
        _SiPlayPrevious = ImageVector.Builder(
            name = "Filled.SiPlayPrevious",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.8f, 4f)
                horizontalLineToRelative(1.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5.8f)
                verticalLineToRelative(12.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.2f, 20f)
                horizontalLineTo(4.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.2f)
                close()
                moveTo(21.462f, 4.113f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5f)
                verticalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.573f, 0.82f)
                lineToRelative(-10f, -7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.64f)
                lineToRelative(10f, -7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.035f, -0.067f)
            }
        }.build()

        return _SiPlayPrevious!!
    }

@Suppress("ObjectPropertyName")
private var _SiPlayPrevious: ImageVector? = null
