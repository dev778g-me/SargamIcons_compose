package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiGridView: ImageVector
    get() {
        if (_SiGridView != null) {
            return _SiGridView!!
        }
        _SiGridView = ImageVector.Builder(
            name = "Filled.SiGridView",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.6f, 3f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.6f)
                verticalLineToRelative(2.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.6f, 11f)
                horizontalLineToRelative(2.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 8.4f)
                verticalLineTo(5.6f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 3f)
                close()
                moveTo(5.6f, 13f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 15.6f)
                verticalLineToRelative(2.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.6f, 21f)
                horizontalLineToRelative(2.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, -2.6f)
                verticalLineToRelative(-2.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 13f)
                close()
                moveTo(15.6f, 3f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 5.6f)
                verticalLineToRelative(2.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 2.6f)
                horizontalLineToRelative(2.8f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 8.4f)
                verticalLineTo(5.6f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.4f, 3f)
                close()
                moveTo(15.6f, 13f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.6f, 2.6f)
                verticalLineToRelative(2.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 2.6f)
                horizontalLineToRelative(2.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, -2.6f)
                verticalLineToRelative(-2.8f)
                arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.6f, -2.6f)
                close()
            }
        }.build()

        return _SiGridView!!
    }

@Suppress("ObjectPropertyName")
private var _SiGridView: ImageVector? = null
