package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiUserAlt3: ImageVector
    get() {
        if (_SiUserAlt3 != null) {
            return _SiUserAlt3!!
        }
        _SiUserAlt3 = ImageVector.Builder(
            name = "Filled.SiUserAlt3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.25f, 7f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.5f, 0f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.5f, 0f)
                moveTo(20.75f, 21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                horizontalLineTo(4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                verticalLineToRelative(-4.6f)
                arcToRelative(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.15f, -3.15f)
                horizontalLineToRelative(11.2f)
                arcToRelative(3.15f, 3.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.15f, 3.15f)
                close()
            }
        }.build()

        return _SiUserAlt3!!
    }

@Suppress("ObjectPropertyName")
private var _SiUserAlt3: ImageVector? = null
