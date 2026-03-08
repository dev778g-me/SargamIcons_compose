package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiEditSimple: ImageVector
    get() {
        if (_SiEditSimple != null) {
            return _SiEditSimple!!
        }
        _SiEditSimple = ImageVector.Builder(
            name = "Filled.SiEditSimple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.738f, 3.727f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.838f, 0f)
                lineToRelative(1.697f, 1.697f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.838f)
                lineTo(8.818f, 18.718f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.255f, 0.136f)
                lineToRelative(-3.536f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.588f, -0.588f)
                lineToRelative(0.707f, -3.535f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.137f, -0.256f)
                close()
            }
        }.build()

        return _SiEditSimple!!
    }

@Suppress("ObjectPropertyName")
private var _SiEditSimple: ImageVector? = null
