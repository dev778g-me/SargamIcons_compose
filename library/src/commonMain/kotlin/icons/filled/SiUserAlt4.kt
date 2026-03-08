package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiUserAlt4: ImageVector
    get() {
        if (_SiUserAlt4 != null) {
            return _SiUserAlt4!!
        }
        _SiUserAlt4 = ImageVector.Builder(
            name = "Filled.SiUserAlt4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.25f, 6f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.5f, 0f)
                arcToRelative(4.75f, 4.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.5f, 0f)
                moveTo(2.25f, 22f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
            }
        }.build()

        return _SiUserAlt4!!
    }

@Suppress("ObjectPropertyName")
private var _SiUserAlt4: ImageVector? = null
