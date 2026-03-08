package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiGrid: ImageVector
    get() {
        if (_SiGrid != null) {
            return _SiGrid!!
        }
        _SiGrid = ImageVector.Builder(
            name = "Filled.SiGrid",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.6f, 2f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4.6f)
                verticalLineToRelative(3.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.6f, 11f)
                horizontalLineToRelative(3.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8.4f)
                verticalLineTo(4.6f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 2f)
                close()
                moveTo(15.6f, 2f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 4.6f)
                verticalLineToRelative(3.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 2.6f)
                horizontalLineToRelative(3.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 8.4f)
                verticalLineTo(4.6f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.4f, 2f)
                close()
                moveTo(4.6f, 13f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 15.6f)
                verticalLineToRelative(3.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.6f, 22f)
                horizontalLineToRelative(3.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, -2.6f)
                verticalLineToRelative(-3.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 13f)
                close()
                moveTo(15.6f, 13f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.6f, 2.6f)
                verticalLineToRelative(3.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 2.6f)
                horizontalLineToRelative(3.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, -2.6f)
                verticalLineToRelative(-3.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.6f, -2.6f)
                close()
            }
        }.build()

        return _SiGrid!!
    }

@Suppress("ObjectPropertyName")
private var _SiGrid: ImageVector? = null
