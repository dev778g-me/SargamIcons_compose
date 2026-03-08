package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiUserAlt6: ImageVector
    get() {
        if (_SiUserAlt6 != null) {
            return _SiUserAlt6!!
        }
        _SiUserAlt6 = ImageVector.Builder(
            name = "Filled.SiUserAlt6",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18.714f)
                curveToRelative(0f, 0.888f, -0.371f, 1.729f, -1.014f, 2.34f)
                curveToRelative(-0.64f, 0.611f, -1.5f, 0.946f, -2.386f, 0.946f)
                horizontalLineTo(5.4f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.386f, -0.945f)
                arcTo(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18.714f)
                curveToRelative(0f, -1.797f, 0.75f, -3.51f, 2.067f, -4.765f)
                arcTo(7.16f, 7.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                horizontalLineToRelative(6f)
                curveToRelative(1.841f, 0f, 3.616f, 0.696f, 4.933f, 1.95f)
                reflectiveCurveTo(22f, 16.916f, 22f, 18.713f)
                moveTo(17f, 6f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7f, 6f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 0f)
            }
        }.build()

        return _SiUserAlt6!!
    }

@Suppress("ObjectPropertyName")
private var _SiUserAlt6: ImageVector? = null
