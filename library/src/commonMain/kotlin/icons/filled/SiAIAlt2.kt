package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiAIAlt2: ImageVector
    get() {
        if (_SiAIAlt2 != null) {
            return _SiAIAlt2!!
        }
        _SiAIAlt2 = ImageVector.Builder(
            name = "Filled.SiAIAlt2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(2f)
                lineTo(16f, 7f)
                horizontalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                close()
                moveTo(5f, 11f)
                horizontalLineToRelative(4f)
                lineTo(9f, 7f)
                lineTo(5f, 7f)
                close()
                moveTo(11f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-5f)
                lineTo(5f, 13f)
                verticalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                lineTo(3f, 6.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.8f, 5f)
                horizontalLineToRelative(4.4f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 6.8f)
                close()
            }
        }.build()

        return _SiAIAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SiAIAlt2: ImageVector? = null
