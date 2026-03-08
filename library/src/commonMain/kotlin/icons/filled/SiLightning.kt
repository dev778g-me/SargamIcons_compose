package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiLightning: ImageVector
    get() {
        if (_SiLightning != null) {
            return _SiLightning!!
        }
        _SiLightning = ImageVector.Builder(
            name = "Filled.SiLightning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.133f, 2.379f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.77f, 0.785f)
                lineTo(13.848f, 9.5f)
                horizontalLineToRelative(3.819f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.784f, 1.621f)
                lineToRelative(-7.917f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.77f, -0.785f)
                lineTo(9.819f, 14f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.783f, -1.621f)
                close()
            }
        }.build()

        return _SiLightning!!
    }

@Suppress("ObjectPropertyName")
private var _SiLightning: ImageVector? = null
