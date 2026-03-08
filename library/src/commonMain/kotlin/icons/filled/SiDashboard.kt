package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiDashboard: ImageVector
    get() {
        if (_SiDashboard != null) {
            return _SiDashboard!!
        }
        _SiDashboard = ImageVector.Builder(
            name = "Filled.SiDashboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.6f, 2f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4.6f)
                verticalLineToRelative(4.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.6f, 12f)
                horizontalLineToRelative(2.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9.4f)
                verticalLineTo(4.6f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 2f)
                close()
                moveTo(5.6f, 14f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 16.6f)
                verticalLineToRelative(2.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.6f, 22f)
                horizontalLineToRelative(2.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, -2.6f)
                verticalLineToRelative(-2.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 14f)
                close()
                moveTo(15.6f, 2f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 4.6f)
                verticalLineToRelative(2.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 2.6f)
                horizontalLineToRelative(2.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 7.4f)
                verticalLineTo(4.6f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.4f, 2f)
                close()
                moveTo(15.6f, 12f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.6f, 2.6f)
                verticalLineToRelative(4.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 2.6f)
                horizontalLineToRelative(2.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, -2.6f)
                verticalLineToRelative(-4.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.6f, -2.6f)
                close()
            }
        }.build()

        return _SiDashboard!!
    }

@Suppress("ObjectPropertyName")
private var _SiDashboard: ImageVector? = null
