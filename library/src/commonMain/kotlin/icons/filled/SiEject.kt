package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiEject: ImageVector
    get() {
        if (_SiEject != null) {
            return _SiEject!!
        }
        _SiEject = ImageVector.Builder(
            name = "Filled.SiEject",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.18f, 13.427f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 15f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.82f, -1.573f)
                lineToRelative(-7f, -10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.64f, 0f)
                close()
                moveTo(4f, 19.2f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.8f, 21f)
                horizontalLineToRelative(12.4f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.8f, -1.8f)
                verticalLineToRelative(-0.4f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.8f, -1.8f)
                horizontalLineTo(5.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18.8f)
                close()
            }
        }.build()

        return _SiEject!!
    }

@Suppress("ObjectPropertyName")
private var _SiEject: ImageVector? = null
