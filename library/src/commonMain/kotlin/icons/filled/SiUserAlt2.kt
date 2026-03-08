package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiUserAlt2: ImageVector
    get() {
        if (_SiUserAlt2 != null) {
            return _SiUserAlt2!!
        }
        _SiUserAlt2 = ImageVector.Builder(
            name = "Filled.SiUserAlt2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.9f, 14f)
                curveToRelative(4.474f, 0f, 8.1f, 3.582f, 8.1f, 8f)
                horizontalLineTo(3f)
                curveToRelative(0f, -4.418f, 3.626f, -8f, 8.1f, -8f)
                close()
                moveTo(12f, 1.25f)
                arcTo(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.75f, 6f)
                verticalLineToRelative(1f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -9.5f, 0f)
                verticalLineTo(6f)
                arcTo(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1.25f)
            }
        }.build()

        return _SiUserAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SiUserAlt2: ImageVector? = null
