package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiUserAlt5: ImageVector
    get() {
        if (_SiUserAlt5 != null) {
            return _SiUserAlt5!!
        }
        _SiUserAlt5 = ImageVector.Builder(
            name = "Filled.SiUserAlt5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.25f, 7f)
                curveToRelative(0f, -3.164f, 2.586f, -5.75f, 5.75f, -5.75f)
                reflectiveCurveTo(17.75f, 3.836f, 17.75f, 7f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 3.164f, -2.586f, 5.75f, -5.75f, 5.75f)
                reflectiveCurveTo(6.25f, 11.664f, 6.25f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.6f, 22f)
                horizontalLineToRelative(16.78f)
                curveToRelative(0.88f, 0f, 1.6f, -0.72f, 1.6f, -1.6f)
                verticalLineToRelative(-3.65f)
                curveToRelative(0f, -0.24f, 0f, -0.5f, -0.12f, -0.62f)
                curveToRelative(-0.37f, -0.87f, -1.5f, -1.63f, -3.25f, -2.25f)
                curveTo(17.657f, 14.63f, 15f, 16f, 12f, 16f)
                reflectiveCurveToRelative(-5.42f, -1.37f, -6.63f, -2.12f)
                curveToRelative(-1.75f, 0.63f, -2.87f, 1.37f, -3.25f, 2.25f)
                curveToRelative(-0.12f, 0.24f, -0.12f, 0.37f, -0.12f, 0.62f)
                verticalLineToRelative(3.65f)
                curveToRelative(0f, 0.88f, 0.72f, 1.6f, 1.6f, 1.6f)
            }
        }.build()

        return _SiUserAlt5!!
    }

@Suppress("ObjectPropertyName")
private var _SiUserAlt5: ImageVector? = null
