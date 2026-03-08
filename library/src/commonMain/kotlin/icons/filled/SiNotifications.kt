package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiNotifications: ImageVector
    get() {
        if (_SiNotifications != null) {
            return _SiNotifications!!
        }
        _SiNotifications = ImageVector.Builder(
            name = "Filled.SiNotifications",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.25f)
                arcToRelative(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.737f, 1.967f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 10f)
                verticalLineToRelative(7f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                horizontalLineToRelative(16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.263f, -6.783f)
                quadToRelative(0.012f, -0.106f, 0.013f, -0.217f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 1.25f)
                moveTo(12f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                horizontalLineToRelative(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
            }
        }.build()

        return _SiNotifications!!
    }

@Suppress("ObjectPropertyName")
private var _SiNotifications: ImageVector? = null
