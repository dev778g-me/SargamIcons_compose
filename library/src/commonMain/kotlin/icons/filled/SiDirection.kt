package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiDirection: ImageVector
    get() {
        if (_SiDirection != null) {
            return _SiDirection!!
        }
        _SiDirection = ImageVector.Builder(
            name = "Filled.SiDirection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.932f, 0.638f)
                lineToRelative(7f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.437f, 1.225f)
                lineTo(12f, 18.065f)
                lineToRelative(-6.495f, 3.798f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.437f, -1.225f)
                lineToRelative(7f, -18f)
                lineToRelative(0.066f, -0.138f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
            }
        }.build()

        return _SiDirection!!
    }

@Suppress("ObjectPropertyName")
private var _SiDirection: ImageVector? = null
