package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiLayers: ImageVector
    get() {
        if (_SiLayers != null) {
            return _SiLayers!!
        }
        _SiLayers = ImageVector.Builder(
            name = "Filled.SiLayers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.515f, 15.126f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.97f, 1.748f)
                lineToRelative(-9f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, 0f)
                lineToRelative(-9f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.97f, -1.748f)
                lineTo(12f, 19.856f)
                close()
                moveTo(20.515f, 11.126f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.97f, 1.748f)
                lineToRelative(-9f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, 0f)
                lineToRelative(-9f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0.97f, -1.748f)
                lineTo(12f, 15.856f)
                close()
                moveTo(11.63f, 2.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.854f, 0.056f)
                lineToRelative(9f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.748f)
                lineToRelative(-9f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, 0f)
                lineToRelative(-9f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.748f)
                lineToRelative(9f, -5f)
                close()
            }
        }.build()

        return _SiLayers!!
    }

@Suppress("ObjectPropertyName")
private var _SiLayers: ImageVector? = null
