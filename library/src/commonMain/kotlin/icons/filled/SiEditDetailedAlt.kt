package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiEditDetailedAlt: ImageVector
    get() {
        if (_SiEditDetailedAlt != null) {
            return _SiEditDetailedAlt!!
        }
        _SiEditDetailedAlt = ImageVector.Builder(
            name = "Filled.SiEditDetailedAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.425f, 4.575f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.536f, 0f)
                lineToRelative(-1.06f, 1.061f)
                lineToRelative(3.535f, 3.536f)
                lineToRelative(1.06f, -1.061f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.536f)
                moveTo(14.121f, 6.343f)
                lineToRelative(3.536f, 3.536f)
                lineToRelative(-8.839f, 8.838f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.255f, 0.137f)
                lineToRelative(-3.536f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.588f, -0.588f)
                lineToRelative(0.707f, -3.536f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.137f, -0.255f)
                close()
            }
        }.build()

        return _SiEditDetailedAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiEditDetailedAlt: ImageVector? = null
